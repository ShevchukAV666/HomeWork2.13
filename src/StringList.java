public interface StringList {

    String add(String item);

    String add(int index, String item);

    String set(int index, String item);

    String remove(String item);

    String remove(int index);

    boolean contains(String item);

    int indexOf(String item);

    int lastIndexOf(String item);

    String get(int index);

    boolean equals(String otherList);

    int size();

    int isEmpty();

    void clear();

    String[] toArray();


}
