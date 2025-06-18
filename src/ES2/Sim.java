package ES2;

public class Sim {
    private String numTel;
    private int credit;
    private String[] lastFiveCall;
    private int callIndex;

    public Sim(String num) {
        this.numTel = num;
        this.credit = 0;
        this.lastFiveCall = new String[5];
        this.callIndex = 0;
    }
        public String printInfo(){
            String calls = "";
            for(String call : lastFiveCall){
                if(call != null){
                    calls += call + "|" + "\n";
                }
            }
            return "numero di telefono: " + numTel +
                    "\nCredito: " + credit + "€" +
                    "\nUltime 5 chiamate:\n" + calls;
        }

        public void addCall(String calledNum, int duration){
            String callInfo = "Numero chiamato: " + calledNum + " Durata chiamata: " + duration + " min";
            lastFiveCall[callIndex % 5] = callInfo;
            callIndex++;
        }

        public void recharge(int imp){
        if (imp > 0) {
            credit += imp;
        }
        }
    }

