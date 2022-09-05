package desafio.composicao.oo;

import java.util.ArrayList;

public class Compra {
    Item item;

    Compra(Item item) {
        this.item = item;
    }

    ArrayList<Item> listaItens = new ArrayList<>();
}

