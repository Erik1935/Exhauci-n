//Erik Jose Canche Dominguez
package acercandoseapi;
public class AcercandoseAPi {
private double A;
private double B;
private double C;
private double D;
private double E;
private double F;
private double G;
private double H;


    public AcercandoseAPi(int a, int b) {
        this.A = a;
        this.B = b;
    }

    public void cicloExhaustivo() {
        C = B / 2;
        D = Math.sqrt((1 - (C * C)));
        E = 1 - D;
        F = Math.sqrt(((C * C) + (E * E)));
        G = A * B;
        H = G / 2;
        System.out.println(A + "  " + B + "   " + C + "   " + D + "   " + E + "   " + F + "   " + G + "   " + H);
    }

    public void ciclos() {
        for (int i = 1; i <= 12; i++) {
            cicloExhaustivo();
            A = A * 2;
            B = F;
        }
    }

    public static void main(String[] args) {
        AcercandoseAPi api = new AcercandoseAPi(6, 1);
        api.ciclos();
    }

}
