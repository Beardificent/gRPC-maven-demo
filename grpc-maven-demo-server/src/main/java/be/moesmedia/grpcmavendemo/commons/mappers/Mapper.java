package be.moesmedia.grpcmavendemo.commons.mappers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

import be.moesmedia.grpcmavendemo.commons.exceptions.MapperFailedException;

public interface Mapper<INPUT, OUTPUT> {
    OUTPUT map(INPUT mapFrom, OUTPUT mapTo);

    @SuppressWarnings("unchecked")
    default OUTPUT map(INPUT mapFrom) {
        try {
            final var clazz = ((Class<OUTPUT>) ((ParameterizedType) (this.getClass().getGenericInterfaces()[0]))
                    .getActualTypeArguments()[1]);
            return map(mapFrom, clazz.getDeclaredConstructor().newInstance());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new MapperFailedException(e);
        }
    }
}
