package py.com.sif.wsaaclient.artifacts.py;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name="WsaaServerBean", targetNamespace="http://ejb.server.wsaa.dna.gov.py/")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public abstract interface WsaaServerBean
{
  @WebMethod
  @WebResult(partName="return")
  public abstract String loginCms(@WebParam(name="arg0", partName="arg0") String paramString);
}
