package net.skybooking.asyncevent.listener;

import net.skybooking.asyncevent.events.GenericEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GenericEventListener {

    @EventListener(classes = {GenericEvent.class})
    public void handleCreatedEvent(GenericEvent<Object> event) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Received spring generic event - " + event.getObject());
    }

    @EventListener(classes = {GenericEvent.class}, condition = "#event.success")
    public void handleCreatedSuccessEvent(GenericEvent<Object> event) {
        System.out.println("Handling generic event (conditional).");
    }

}
