package com.immutable;

public class StringHolderImmutable {

        private String string;

        public StringHolderImmutable(String s) {
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
            else if (o == null || !(o instanceof StringHolderImmutable))
                return false;
            else {
                final StringHolderImmutable other = (StringHolderImmutable) o;

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
