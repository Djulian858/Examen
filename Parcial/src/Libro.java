public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
    
    //constructor vacio

    public Libro(){}

    //constructor 

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // GET - SET

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public int getNumeroEjemplares()
    {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares)
    {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados()
    {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados)
    {
        this.numeroEjemplaresPrestados= numeroEjemplaresPrestados;
    }

    // metodo prestamo

    public boolean prestamo()
    {
        if(this.numeroEjemplares > this.numeroEjemplaresPrestados)
        {
            this.numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    //metodo devolucion

    public boolean devolucion()
    {
        if(this.numeroEjemplaresPrestados > 0)
        {
        this.numeroEjemplaresPrestados--;
        return true;
        }
        return false;
    }

    public String toString ()
    {
        return "Titulo: " + this.titulo + "autor: " + this.autor + "Numero de Ejemplares: " + this.numeroEjemplares + 
        "Numero de Ejemplares Prestados: " + this.numeroEjemplaresPrestados;
    }


}
