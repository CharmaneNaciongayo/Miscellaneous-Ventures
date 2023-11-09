public class Ticket {

    public double storedCredit;
    private boolean isItStored;
 
    public Ticket(boolean isSVT) {
        if (isSVT) {
            isItStored = true;
            storedCredit = 150;
        } else {
            isItStored = false;
            storedCredit = 0;
        }
    }

    public void deductFare(double amount) {
        storedCredit -= amount;
    }

    public void topUp(double amount) {
        storedCredit += amount;
    }

    public double getCredit() {
        return storedCredit;
    }

    public boolean isStoredValue() {
        return isItStored;
        }
    }
