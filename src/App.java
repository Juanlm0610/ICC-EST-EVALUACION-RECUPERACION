
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;
import models.Person;
import models.PersonasGenerator;
public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generadas:");
        for (Carro persona : carros) {
            System.out.println(persona);
        }
        PersonasGenerator personaGenerator = new PersonasGenerator();

        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = personaGenerator.generarPersonas();

        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }

        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithInsertion(personas);
        mOB.showpersonas(personas);
        int result = mOB.searchBinaryByAge(personas, 54);
        if (result == -1){
            System.out.println("No se encontro");
        }else{
            System.out.println("Se encontro en la posicion " + result + "->" + personas);
        }

        mOB.sortByAgeWithSelection(personas);
        
        int result1 = mOB.searchBinaryByAge(personas, 34);
        if (result1 == -1){
            System.out.println("No se encontro");
        }else{
            System.out.println("Se encontro en la posicion " + result1 + "->" + personas);
        }

        mOB.sortByHeightWithInsertion(personas);
        
        int result2 = mOB.searchBinaryByHeight(personas, 164);
        if (result2 == -1){
            System.out.println("No se encontro");
        }else{
            System.out.println("Se encontro en la posicion " + result2 + "->" + personas);
        }

        mOB.sortByHeightWithSelection(personas);
        
        int result3 = mOB.searchBinaryByHeight(personas, 194);
        if (result3 == -1){
            System.out.println("No se encontro");
        }else{
            System.out.println("Se encontro en la posicion " + result3 + "->" + personas);
        }

        ///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Listado de carros generadas:");

        MetodosOrdenamientoBusquedaGrupoB mBC = new MetodosOrdenamientoBusquedaGrupoB();
        mBC.sortBYearWithBubbleAvnAsendente(carros);
        mBC.showCars(carros);

        int resultc = mBC.searchBinaryByYear(carros, 2021);
        if (resultc == -1) {
            System.out.println("No se encontro el carro");
        } else {
            System.out.println("El carro se encuentra en la posicion: " + resultc);
        }

        mBC.sortBYearWithBubbleAvnDesendente(carros);
        int resultc2 = mBC.searchBinaryByYear(carros, 2019);
        if (resultc2 == -1) {
            System.out.println("No se encontro el carro");
        } else {
            System.out.println("El carro se encuentra en la posicion: " + resultc2);
        }
    }
}

    
