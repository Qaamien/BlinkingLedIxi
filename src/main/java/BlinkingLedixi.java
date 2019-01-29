import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.wiringpi.Gpio;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.iota.ict.ixi.Ixi;
import org.iota.ict.ixi.IxiModule;
import org.iota.ict.network.event.GossipEvent;
import org.iota.ict.network.event.GossipListener;



// This IXI module makes led blink everytime node receives gossip event

public class BlinkingLedixi extends IxiModule {

        //create gpio controller
        final GpioController gpio = GpioFactory.getInstance();

        //Setup GPIO_00 as output pin
        final GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);

         private final static Logger LOGGER = LogManager.getLogger(BlinkingLedixi.class);


    public BlinkingLedixi(Ixi ixi) {
            super(ixi);
        }

        @Override

        public void run() {

        LOGGER.info("Blinking Led IXI module started!");

        //Everytime node receives gossip event it puts pin HIGH for 10 ms, so led blinks
        this.ixi.addGossipListener(new GossipListener() {

                @Override
                public void onGossipEvent(GossipEvent gossipEvent) {

                        ledPin.high();
                        Gpio.delay(10);
                        ledPin.low();
                }

            });

        }

    }


