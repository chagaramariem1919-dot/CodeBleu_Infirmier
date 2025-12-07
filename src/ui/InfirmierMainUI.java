package ui;

import corba.CORBAClient;

public class InfirmierMainUI {
    public static void main(String[] args) {
        CORBAClient client = new CORBAClient(args);
        new FormUrgenceUI(client);
    }
}
