

void main() {
    HashMap<String, Integer> varste = new HashMap<>();
    varste.put("Ioan", 21);
    varste.put("Maria", 22);
    varste.put("Victor", 20);
    varste.put("Simina", 20);
    varste.put("Marius", 21);
    varste.put("Mihai", 21);
    varste.put("Daniela", 23);

    Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
            "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");


    //primul MAP
    for(Object key : varste.keySet())
    {
        Object value = varste.get(key);
        IO.println("Nume: " + key + "    " + " Varsta: "+ value);
    }

    IO.println();
    IO.println();
//Primul MAP dupa adaugare
    varste.put("Vlad", 19);
    varste.put("Iulia", 19);

    for(Object key : varste.keySet())
    {
        Object value = varste.get(key);
        IO.println("Nume: " + key + "    " + " Varsta: "+ value);
    }


   //Al doilea MAP
    IO.println();
    IO.println();

    for(Object key : adrese.keySet())
    {
        Object value = adrese.get(key);
        IO.println("Nume: " + key + "    " + " Adresa: "+ value);
    }


    HashMap<String, Tanar> tineri = new HashMap<>();


    for (String nume : varste.keySet()) {
        Integer varsta = varste.get(nume);


        String adresa = adrese.getOrDefault(nume, "Adresa necunoscuta");

        Tanar tanarNou = new Tanar(nume, varsta, adresa);
        tineri.put(nume, tanarNou);

        System.out.println("Tineri:");
        for (String name : tineri.keySet()) {
            Tanar dateTanar = tineri.get(nume);
            System.out.println("Cheie: " + nume + " -> Valoare: " + dateTanar.toString());
        }
    }}
