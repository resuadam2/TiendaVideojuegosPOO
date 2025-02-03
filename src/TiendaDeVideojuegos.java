import java.util.ArrayList;

public class TiendaDeVideojuegos {
    private ArrayList<Videojuego> videojuegos;

    public TiendaDeVideojuegos() {
        this.videojuegos = new ArrayList<Videojuego>();
    }

    public boolean addVideojuego(Videojuego nuevo) {
        for (Videojuego x : videojuegos) {
            if (x.getPlataforma().equals(nuevo.getPlataforma()) && x.getTitulo().equals(nuevo.getTitulo())) {
                System.out.println("El videojuego " + nuevo.getTitulo() + " no se ha añadido porque ya existe.");
                return false;
            }
        }
        videojuegos.add(nuevo);
        return true;
    }

    public void deleteVideojuego(int pos) {
        if (pos < videojuegos.size() && pos >= 0) {
            videojuegos.remove(pos);
        } else {
            System.out.println("ERROR: Posición incorrecta.");
        }
    }

    public void deleteVideojuego(Videojuego videojuego) {
        if(videojuegos.contains(videojuego)) videojuegos.remove(videojuego);
        else System.out.println("ERROR: El videojuego no existe en la tienda.");
    }

    @Override
    public String toString() {
        String toret = "Tienda:\n";
        for (Videojuego videojuego: videojuegos) {
            toret += videojuego.toString();
        }
        return toret;
    }
}
