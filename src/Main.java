public class Main {
    public static void main(String[] args) {
        TiendaDeVideojuegos tienda = new TiendaDeVideojuegos();
        Videojuego v1 = new Videojuego();
        Videojuego v2 = new Videojuego("Super Mario Bros", "N64", 300);
        Videojuego v3 = v2;
        tienda.addVideojuego(v1);
        tienda.addVideojuego(v2);
        tienda.addVideojuego(v3);
        System.out.println(tienda);
        tienda.deleteVideojuego(5);
        tienda.deleteVideojuego(0);
        System.out.println(tienda);
        tienda.deleteVideojuego(v3);
        tienda.deleteVideojuego(v1);
        System.out.println(tienda);
    }
}
