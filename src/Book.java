public class Book {

    private String titolo;
    private int nPagine;
    private String autore;
    private String editore;

    public Book(String titolo, int nPagine, String autore, String editore) {
        if (!titolo.isBlank() && !titolo.isEmpty()) {
            this.titolo = titolo;
        } else {
            throw new RuntimeException("Dati errari");
        }
        if (nPagine > 0) {
            this.nPagine = nPagine;
        } else {
            throw new RuntimeException("Dati errati");
        }
        if (!autore.isBlank() && !autore.isEmpty()) {
            this.autore = autore;
        } else {
            throw new RuntimeException("Dati errati");
        }
        if (!editore.isBlank() && !editore.isEmpty()) {
            this.editore = editore;
        } else {
            throw new RuntimeException("Dati errati");
        }
    }

    public String getTitolo() {
        return titolo;
    }
    public int getnPagine() {
        return nPagine;
    }
    public String getAutore() {
        return autore;
    }
    public String getEditore() {
        return editore;
    }

    private void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    private void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

    private void setAutore(String autore) {
        this.autore = autore;
    }

    private void setEditore(String editore) {
        this.editore = editore;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titolo='" + titolo + '\'' +
                ", nPagine=" + nPagine +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                '}';
    }
}
