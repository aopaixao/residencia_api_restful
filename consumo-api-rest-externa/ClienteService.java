@Service
public class ClienteService {
  public ReceitaWsDadosCnpjVO consultarDadosPorCnpj(String cnpj) {
		RestTemplate restTemplate = new RestTemplate();
		
		Map<String, String> params = new HashMap<String, String>();
	    params.put("cnpj", cnpj);
		
		ReceitaWsDadosCnpjVO receitaWsDadosCnpjVO = restTemplate.getForObject(receitawsUrl, ReceitaWsDadosCnpjVO.class, params);
		
		return receitaWSVO;
	}
}
