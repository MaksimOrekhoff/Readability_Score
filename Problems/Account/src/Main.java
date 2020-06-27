class Account {

    private long balance;
    private String ownerName;
    private boolean locked;
    public void setBalance(long money) {
        this.balance = money;
    }
    public long getBalance() {
        return balance;
    }
    public void setOwnerName(String name) {
        this.ownerName = name;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    public boolean isLocked() {
        return locked;
    }
}