package be.moesmedia.grpcmavendemoclient.commons.mappers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

import be.moesmedia.grpcmavendemoclient.commons.exceptions.MapperFailedException;

 
public interface BiMapper<INPUT, OUTPUT> extends Mapper<INPUT, OUTPUT> {
    INPUT mapBack(OUTPUT mapFrom, INPUT mapTo);

    @SuppressWarnings("unchecked")
    default INPUT mapBack(OUTPUT mapFrom) {
        try {
            final var clazz = ((Class<INPUT>) ((ParameterizedType) (this.getClass().getGenericInterfaces()[0]))
                    .getActualTypeArguments()[0]);
            return mapBack(mapFrom, clazz.getDeclaredConstructor().newInstance());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new MapperFailedException(e);
        }
    }
} 

