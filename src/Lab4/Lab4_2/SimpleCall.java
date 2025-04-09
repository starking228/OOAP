package Lab4.Lab4_2;

class SimpleCall implements Phone {
    @Override
    public void makeCall(String contact) {
        System.out.println("Call to " + contact);
    }
}

