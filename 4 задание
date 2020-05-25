 public class Rational extends Number implements Comparable<Rational> {
        private int num;
        private int denom;

        public Rational(int num, int denom) {
            this.num = num;
            this.denom = denom;
        }

        public int compareTo(Rational r) {
            if ((num / denom) - (r.num / r.denom) > 0) {
                return +1;
            } else if ((num / denom) - (r.num / r.denom) < 0) {
                return -1;
            }
            return 0;
        }

        public Rational add(Rational r) {
            return new Rational(num + r.num, denom + r.denom);
        }

        public Rational sub(Rational r) {
            return new Rational(num - r.num, denom - r.denom);
        }

        public Rational mul(Rational r) {
            return new Rational(num * r.num, denom * r.denom);
        }

        public Rational div(Rational r) {
            return new Rational(num * r.denom, denom * r.num);
        }

        public int gcd(Rational r) {
            int i = 1;
            while (i != 0) {
                i = denom % r.denom;
                denom = r.denom;
                r.denom = i;
            }
            return denom;
        }

        public String toString() {
            String a = num + "/" + denom;
            return a;
        }

        public double doubleValue() {
            return (double) doubleValue();
        }

        public float floatValue() {
            return (float) floatValue();
        }

        public int intValue() {
            return (int) intValue();
        }
        public static class Main {

            public static void main(String[] args) {

                Rational a = new Rational(2, 4);
                Rational b = new Rational(2, 6);

                System.out.println(a + " + " + b + " = " + a.add(b));
                System.out.println(a + " - " + b + " = " + a.sub(b));
                System.out.println(a + " * " + b + " = " + a.mul(b));
                System.out.println(a + " / " + b + " = " + a.div(b));

                Rational[] arr = {new Rational(7, 1), new Rational(6, 1),
                        new Rational(5, 1), new Rational(4, 1),
                        new Rational(3, 1), new Rational(2, 1),
                        new Rational(1, 1), new Rational(1, 2),
                        new Rational(1, 3), new Rational(1, 4),
                        new Rational(1, 5), new Rational(1, 6),
                        new Rational(1, 7), new Rational(1, 8),
                        new Rational(1, 9), new Rational(0, 1)};

                selectSort(arr);

                for (int i = 0; i < arr.length - 1; ++i) {
                    if (arr[i].compareTo(arr[i + 1]) > 0) {
                        System.exit(1);
                    }
                }


                Number n = new Rational(3, 2);

                System.out.println(n.doubleValue());
                System.out.println(n.floatValue());
                System.out.println(n.intValue());
                System.out.println(n.longValue());
            }

            public static <T extends Comparable<? super T>> void selectSort(T[] array) {

                T temp;
                int mini;

                for (int i = 0; i < array.length - 1; ++i) {

                    mini = i;

                    for (int j = i + 1; j < array.length; ++j) {
                        if (array[j].compareTo(array[mini]) < 0) {
                            mini = j;
                        }
                    }

                    if (i != mini) {
                        temp = array[i];
                        array[i] = array[mini];
                        array[mini] = temp;
                    }
                }
            }
        }
        public long longValue() {
            return (long) longValue();
        }
    }

