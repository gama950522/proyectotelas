package mx.com.telas.uttt.control.interfaces;

import java.util.List;

public interface IOperaciones {

    public boolean add(Object o);

    public boolean edit(Object o);

    public boolean delete(Integer id);

    public List<Object> find();
    
//    public List<Object> find(Object o);

    public List<Object> find(List<Object> lst);

    public Object find(Object o);

    public Object find(Integer id);

    public int getCount();

    public int getLastID();
    
    public Object getLastField();

    /*
     * :v :u
     */
}
