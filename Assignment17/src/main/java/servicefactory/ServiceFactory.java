package servicefactory;

import service.BlogServiceImpl;
import service.IBlogService;

public class ServiceFactory {
	private static IBlogService service;

	private ServiceFactory() {
	}

	public static IBlogService getServiceObject() {
		if (service == null)
			service = new BlogServiceImpl();
		return service;
	}
}
