package fr.sportpourtous.domain;

import java.util.Objects;
import java.util.UUID;

public class UserId {
    private final UUID value;

    private UserId(UUID value) {
        this.value = value;
    }

    public static UserId
    of(UUID value) {
        return new UserId
                (value);
    }

    public String value() {
        return value.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId
                UserId
                = (UserId
                ) o;
        return Objects.equals(value, UserId
                .value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "UserId{" +
                "value='" + value + '\'' +
                '}';
    }
}

