# dota2hue
philips hue ambiance from dota 2 events

demo here : 
https://media.giphy.com/media/26n6NMIjJaQv826ys/giphy.gif

### Prerequisites

- Java 8 
- Maven 
- Dota 2 Client 
- SteelSeries Engine 3 
- Philips Hue Bridge and Some lights 


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


### Installing


## Set up for Philips Hue


Getting started
First make sure you have your hue kit connected and installed. For help with this please visit the getting started page or if you still need to buy a kit check out where to buy hue.

To view the full API documentation and to become a member of our exciting community please create an account.  It only takes a second.

The fastest way to learn how to build apps which control the hue system is to use the simple test web app built into every bridge. This lets you directly input commands and send them to the lights. You can look at the source HTML and JavaScript code for some directions on how to do something different.

#Step 1
First make sure your bridge is connected to your network and is functioning properly. Test that the smartphone app can control the lights on the same network.

#Step 2
Then you need to discover the IP address of the bridge on your network. You can do this in a few ways.

Use a UPnP discovery app to find Philips hue in your network.
Use our broker server discover process by visiting www.meethue.com/api/nupnp
Log into your wireless router and look Philips hue up in the DHCP table.
Hue App method: Download the official Philips hue app. Connect your phone to the network the hue bridge is on. Start the hue app(iOS described here). Push link connect to the bridge. Use the app to find the bridge and try controlling lights. All working -- Go to the settings menu in the app. Go to My Bridge. Go to Network settings. Switch off the DHCP toggle. The ip address of the bridge will show. Note the ip address, then switch DHCP back on
N.B When you are ready to make a production app you will need to discover the bridge automatically using the Hue Bridge Discovery Guide or the tools provided with the official Philips hue SDKs

#Step 3
Once you have the address load the test app by visiting the following address in your web browser.

Do not be lazy write the dam thing !
```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system ( when i write them :D ) 


## Authors

* **Danail Vilos** - *Initial work* - https://github.com/dadobt


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
