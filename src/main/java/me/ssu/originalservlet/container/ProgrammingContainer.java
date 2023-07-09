package me.ssu.originalservlet.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.util.Set;

/**
 * @HandlesTypes(.class)
 * 해당 인터페이스의 구현체를 다 찾아 클래스 정보를
 * Set<Class<?>>로 넘긴다.
 */
@HandlesTypes(ApplicationContainerInitializerImpl.class)
public class ProgrammingContainer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> classes, ServletContext servletContext) {
		System.out.println("ProgrammingContainer.onStartup");
		System.out.println("Set<Class<?>> = " + classes);
		System.out.println("servletContext = " + servletContext);

		// [class me.ssu.originalservlet.container.ApplicationContainerInitializer]
		for (Class<?> appInitClass : classes) {
			try {
				// new ApplicationContainerInitializer와 같은 코드
				var appInit = (ApplicationContainerInitializerImpl)
						appInitClass.getDeclaredConstructor().newInstance();
				appInit.onStartUp(servletContext);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}
