public class Sets {

    public static Set New(Object... values) { // vc pode passar quantos parâmetros quiser, incluindo nenhum
        //o objext permite qualquwer tipo de parâmtro, desde arrays a doubles
        Set[] sets = new Set[values.length];
        for (int i = 0; i < values.length; i++)
        {
            if (values[i].getClass() == Set.class)
                sets[i] = (Set)(values[i]);
            else if (values[i].getClass() == Double.class)
                sets[i] = new NumberSet((Double)values[i]);
        }
        return new ValuesSet(sets);
    }
}

// exemplo de como usar o override
// class Animal {
//     public void fazerSom() {
//         System.out.println("Som do animal");
//     }
// }

// class Cachorro extends Animal {
//     @Override
//     public void fazerSom() {
//         System.out.println("Latido");
//     }
// }
