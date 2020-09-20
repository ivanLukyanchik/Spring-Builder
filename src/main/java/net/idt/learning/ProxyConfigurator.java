package net.idt.learning;

public interface ProxyConfigurator {

    Object replaceWithProxyIfNeeded(Object t, Class implClass);

}
