package zad28;

public class Dane {
    public String[] nazwa = {"P", "Q", "AND", "OR", "NOT"};
    public boolean[] a = {true, true, false, false};
    public boolean[] b = {true, false, true, false};

    public boolean[] andrezultat = new boolean[a.length];
    public boolean[] orrezultat = new boolean[a.length];
    public boolean[] xorrezultat = new boolean[a.length];
    public boolean[] notrezultat = new boolean[a.length];


    void funkcjaustw() {
        for (int i = 0; i < a.length; i++) {
            andrezultat[i] = a[i] && b[i];
            orrezultat[i] = a[i] || b[i];
            xorrezultat[i] = a[i] ^ b[i];
            notrezultat[i] = !a[i];
        }
    }

    public void drukujtabelka() {
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s\n", "P", "Q", "AND", "OR", "XOR", "NOT");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s\n",
                    Boolean.toString(a[i]), Boolean.toString(b[i]),
                    Boolean.toString(andrezultat[i]), Boolean.toString(orrezultat[i]),
                    Boolean.toString(xorrezultat[i]), Boolean.toString(!a[i]));
        }
    }
}
