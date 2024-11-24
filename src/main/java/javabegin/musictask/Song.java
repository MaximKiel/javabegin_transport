package javabegin.musictask;

public class Song implements InterfaceSong {

    private String name;
    private Author author;

    public Song() {
    }

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public void play() {
        String result = String.format("Играет песня: %s, автор: %s", name, author.getName());
        System.out.println(result);
    }
}
