package zad8;

import java.util.ArrayList;
import java.util.Objects;

public class Desktop extends Computer{
    public String caseType;

    public Desktop(String manufacturer, String model, String caseType) {
        super(manufacturer, model);
        this.caseType = caseType;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Desktop desktop = (Desktop) o;
        return Objects.equals(getCaseType(), desktop.getCaseType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCaseType());
    }
}
