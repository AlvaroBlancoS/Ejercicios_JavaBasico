public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public String save() {
        return "Guardando";
    }

    @Override
    public String findAll() {
        return "Buscar todo";
    }

    @Override
    public String delete() {
        return "Borrando";
    }

    @Override
    public String toString() {
        return save() + "\n" + findAll() + "\n" + delete();
    }
}
