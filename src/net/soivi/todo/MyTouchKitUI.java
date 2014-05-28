package net.soivi.todo;


import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
/**
 * The UI's "main" class
 */
@SuppressWarnings("serial")
@Widgetset("com.example.tokka.gwt.AppWidgetSet")
@Theme("touchkit")
public class MyTouchKitUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        final TabBarView tabBarView = new TabBarView();
        final NavigationManager navigationManager = new NavigationManager();
        navigationManager.setCurrentComponent(new MenuView());
        tabBarView.addTab(navigationManager);
        setContent(tabBarView);
    }
}
