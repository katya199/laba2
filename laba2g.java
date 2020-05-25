import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class laba2g {

    static class Handler {
        void handle(Chain chain){
            chain.process();
            System.out.println("yeah");
        }
    }

    static class Chain {

        private List<Handler> handlers = new ArrayList<>();
        private int           n        = 0;

        private void setHandlers(int count) {
            int i = 0;
            while (i++ < count) {
                handlers.add(new Handler());
            }
        }

        public void process() {
            if (n < handlers.size()) {
                Handler handler = handlers.get(n++);
                handler.handle(this);
            }
        }
    }

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.setHandlers(10000);
        chain.process();
    }
}