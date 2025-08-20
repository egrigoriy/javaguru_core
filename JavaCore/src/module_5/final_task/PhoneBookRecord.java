package module_5.final_task;

import java.time.LocalDate;
import java.util.Objects;

public record PhoneBookRecord(String name, int number, LocalDate createdDate) {

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PhoneBookRecord that)) return false;
        return number == that.number && Objects.equals(name, that.name) && Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public String toString() {
        return "PhoneBookRecord{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", createdDate=" + createdDate +
                '}';
    }
}
