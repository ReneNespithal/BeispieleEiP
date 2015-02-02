public class Entry<T> {
    /**
     * Eigentliches Element
     */
    private T element;
    /**
     * Verweis auf das na ̈chste Element
     */
    private Entry<T> next;

    /**
     * Erzeugt und initialisiert ein Listen-Element
     * @param o Wert fu ̈r das eigentliche Element *@paramnext Wertfu ̈rdenVerweisaufdasna ̈chsteElement
     */
    public Entry(T o, Entry<T> next) {
        this.element = o;
        this.next = next;
    }

    /**
     * Liefert den Wert fu ̈r das eigentliche Element zuru ̈ck *@return Wertfu ̈rdaseigentlicheElement
     */
    public T getElement() {
        return this.element;
    }

    /**
     * Weist den Wert fu ̈r das eigentliche Element zu
     *
     * @param element Wert fu ̈r das eigentliche Element
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Liefert den Wert fu ̈r den Verweis auf das na ̈chste Element zuru ̈ck *@return Wertfu ̈rdenVerweisaufdasna ̈chsteElement
     */
    public Entry<T> getNext() {
        return this.next;
    }

    /**
     * Weist den Wert fu ̈r den Verweis auf das na ̈chste Element zu *@paramnext Wertfu ̈rdenVerweisaufdasna ̈chsteElement
     */
    public void setNext(Entry<T> next) {
        this.next = next;
    }
}