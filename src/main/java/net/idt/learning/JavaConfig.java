package net.idt.learning;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

    @Getter
    private final Reflections scanner;

    private final Map<Class, Class> ifc2ImplClass;

    public JavaConfig(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        this.scanner = new Reflections(packageToScan);
        this.ifc2ImplClass = ifc2ImplClass;
    }

    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {
        return ifc2ImplClass.computeIfAbsent(ifc, aClass -> {
            Set<Class<? extends T>> subTypesOf = scanner.getSubTypesOf(ifc);
            if (subTypesOf.size() != 1) {
                throw new RuntimeException(ifc + " has 0 or more than 1 impl, please update your config!");
            }
            return subTypesOf.iterator().next();
        });
    }

}
