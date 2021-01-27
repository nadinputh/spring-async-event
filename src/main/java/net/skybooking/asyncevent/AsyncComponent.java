package net.skybooking.asyncevent;

import lombok.RequiredArgsConstructor;
import net.skybooking.asyncevent.events.GenericEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AsyncComponent {

    private final ApplicationEventPublisher eventPublisher;

    @Async
    public void asyncMethodWithVoidReturnType() {
        System.out.println("Execute method asynchronously. " + Thread.currentThread().getName());
        eventPublisher.publishEvent(GenericEvent
            .builder()
            .object("Greeting ....")
            .success(true)
            .build());
    }

}
