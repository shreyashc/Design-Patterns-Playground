public class MultNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;

    }

    @Override
    public void claculate(Numbers request) {
        if (request.getCalcuationWanted().equals("mul")) {
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = "
                    + (request.getNumber1() * request.getNumber2()));
        } else {
            nextInChain.claculate(request);
        }

    }
}
