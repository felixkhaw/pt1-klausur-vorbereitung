package a7;

public class FitnessstudioTest {
    /**
     * Aufgabe (20 Punkte)
     *
     * Ein Fitnessstudio verwaltet verschiedene Arten von Mitgliedschaften.
     * Jede Mitgliedschaft hat einen Namen des Mitglieds und ein Startdatum
     * (hier vereinfacht als int, z.B. Jahr des Beitritts).
     *
     * a) (8 Punkte)
     * Deklarieren Sie eine abstrakte Klasse Mitgliedschaft mit:
     *   - privaten Instanzvariablen name (String) und startjahr (int)
     *   - einem Konstruktor, der beide Werte entgegennimmt und setzt
     *     (Achtung: prüfen Sie im Konstruktor, dass startjahr nicht
     *     negativ ist; ist es negativ, soll eine IllegalArgumentException
     *     geworfen werden)
     *   - konkreten Methoden getName() und getStartjahr()
     *   - einer abstrakten Methode
     *         abstract double monatsbeitrag()
     *     die den monatlichen Beitrag in Euro liefert
     *   - einer konkreten Methode
     *         double jahresbeitrag()
     *     die den Jahresbeitrag berechnet, indem sie monatsbeitrag()
     *     verwendet (also: monatsbeitrag() * 12) — WICHTIG: diese Methode
     *     darf nicht wissen, wie monatsbeitrag() konkret berechnet wird,
     *     sie nutzt nur den (später überschriebenen) Rückgabewert.
     *
     * b) (6 Punkte)
     * Implementieren Sie eine konkrete Klasse Basismitgliedschaft, die
     * Mitgliedschaft erweitert. Der Konstruktor nimmt name und startjahr
     * entgegen und reicht diese an die Basisklasse weiter (Hinweis: super(...)).
     * monatsbeitrag() liefert konstant 19.99.
     *
     * c) (6 Punkte)
     * Implementieren Sie eine konkrete Klasse Premiummitgliedschaft, die
     * ebenfalls Mitgliedschaft erweitert. Zusätzlich zu name und startjahr
     * nimmt ihr Konstruktor einen boolean-Wert mitPersonalTrainer entgegen.
     * monatsbeitrag() liefert 39.99, falls mitPersonalTrainer true ist,
     * sonst 29.99.
     *
     * Tricky-Teil: Premiummitgliedschaft soll außerdem eine Rabattregel
     * einbauen: Ist das Beitrittsjahr (startjahr) mehr als 5 Jahre vor dem
     * aktuellen Jahr (übergeben Sie das aktuelle Jahr NICHT als Parameter,
     * sondern nutzen Sie eine zusätzliche Konstante AKTUELLES_JAHR = 2026
     * in Mitgliedschaft — überlegen Sie sich, ob diese Konstante public
     * static final in der abstrakten Klasse stehen sollte und wie
     * Premiummitgliedschaft darauf zugreift), gibt es 10% Rabatt auf den
     * Monatsbeitrag. Diese Rabattlogik soll monatsbeitrag() in
     * Premiummitgliedschaft mit einbeziehen, OHNE dass sie in
     * Mitgliedschaft oder Basismitgliedschaft sichtbar ist.
     *
     * Hinweis: Denken Sie daran, dass Sie in einem Konstruktor einer
     * abgeleiteten Klasse den Aufruf von super(...) als ERSTE Anweisung
     * benötigen, und dass Sie dort keine Instanzvariablen der abgeleiteten
     * Klasse verwenden können, bevor super(...) abgeschlossen ist.
     */
    public static void main(String[] args) {
        Basismitgliedschaft bm1 = new Basismitgliedschaft("Ulf", 2020);
        System.out.println(bm1.monatsbeitrag());
    }
}
