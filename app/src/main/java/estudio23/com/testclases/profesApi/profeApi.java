package estudio23.com.testclases.profesApi;

import java.util.List;

import estudio23.com.testclases.profesores.Profes;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by jose on 30/6/16.
 */
public interface profeApi
{
    @GET("/Api/GetProductsDetails?productID=1&apiToken=daeb85af-841b-b85e-cbfb-4e4c8b846966")

    void getProfe(Callback<List<Profes>> callback);
}
