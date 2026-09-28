public class Sorter {

    public void sort(Sortable[] objects) {

        for (int i = 0; i < objects.length - 1; i++) {

            for (int j = 0; j < objects.length - 1 - i; j++) {

                if (objects[j].compareTo(objects[j + 1]) > 0) {

                    Sortable temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }
}