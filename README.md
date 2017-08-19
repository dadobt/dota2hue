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

https://www.developers.meethue.com/documentation/getting-started 

get api key and Ip from your Philips Hue Bridge write it in you `application.properties` file  

## Set up for Steam
download and install Steam and Dota 2  
http://store.steampowered.com/ 


## Set up for Steam
download and install Steam and Dota 2  
http://store.steampowered.com/ 


## Set up for Steelseries
download and install 
https://steelseries.com/engine

## Step 1

Once you have all installed and up an running in your config folder you shuld have file like this 

```
PathToYourSteamGames\steamapps\common\dota 2 beta\game\dota\cfg\gamestate_integration\gamestate_integration_steelseries.ctg
```
The inside of that file should look like this 

```
"SSE3 GameSense Integration Configuration"
{
	"uri"	"http://127.0.0.1:49259/dota2_game_event"
	"timeout"	"5.0"
	"buffer"	"0.1"
	"throttle"	"0.1"
	"heartbeat"	"10.0"
	"auth"
	{
		"key1"	"rx54AtFVYw2bXmCCWJu6"
		"key2"	"6HMGuv2F8m5grBFy292d"
	}
	"data"
	{
		"provider"			"1"
		"map"				"1"
		"player"			"1"
		"hero"				"1"
		"abilities"		"1"
		"items"			"1"
	}
}
```

Mark the port number and put it in you `application.properties` file 

at this point you are all set but pls note that you need to close SSE3 becouse it is running on the same port as your application 
note that SSE3 will try to delete the file `gamestate_integration_steelseries.ctg` so you may need to re save it again


## Running the app

`mvn spring-boot:run` or just press play via InteliJ

## Authors

* **Danail Vilos** - *Initial work* - https://github.com/dadobt


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## TODOs:

- [x] Day/Night effects
- [ ] Ultimate effects for every hero  
- [ ] Autodiscovery for Hue Bridge 
- [ ] Error checks
- [ ] Integration Tests
- [ ] batchScript to fix the problem with `gamestate_integration_steelseries.ctg` file
- [ ] front-end ? for Choosing a collor per effect ? (maybe)

## Ultimate effects for every hero  :
- [ ] Lion
- [ ] Axe
- [ ] Zeus
- [ ] Lina
- [ ] Luna
