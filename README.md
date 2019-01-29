# Blinking-Led-PI4J-IXI-module


This is IXI module for IOTA ICT node ( https://github.com/iotaledger/ict )
It makes led blink everytime ICT node receives gossip event.

# Uses:

PI4J GPIO LIBRARY https://github.com/Pi4J/pi4j


# Usage


In code GPIO_00 is set as output pin, it will go high for 10 ms everytime node receives tx. 
Please check out how your Raspberry pi versions pin numbers are defined at http://pi4j.com/
So you can figure out what pin is GPIO_00 on your Raspberry pi.

Connect LED with 1K ohm resistor.

# YOU MUST USE RESISTOR WITH LED OTHERWISE IT MAY CAUSE DAMAGE TO YOUR RASPBERRY PI! 


Download IXI module from ICT's web GUI with Qaamien/BlinkingLedIxi

or clone it from github and compile with: "gradle ixi"
and copy *.jar file in your ict/modules.

See example video on youtube:

https://www.youtube.com/watch?v=RUk5YWw5AW8


##                                ***USE AT YOUR OWN RISK!***

   I am not responsible for any damage caused by running this software. Please use it at your own risk!
                    If you don't understand what you are doing, do not use it.

