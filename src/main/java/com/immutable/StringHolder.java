//https://www.ibm.com/developerworks/java/library/j-jtp02183/index.html


package com.immutable;

public class StringHolder {

    private String string;

    public StringHolder(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        else if (o == null || !(o instanceof StringHolder))
            return false;
        else {
            final StringHolder other = (StringHolder) o;

            if (string == null)
            return (other.string == null);
        else
            return string.equals(other.string);
        }
    }
    public int hashCode() {
        return (string != null ? string.hashCode() : 0);
    }

    public String toString() {
        return string;
    }

}