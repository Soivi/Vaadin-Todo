package com.example.tokka;


import com.vaadin.addon.touchkit.extensions.TouchKitIcon;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet.Tab;
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
        navigationManager.setCaption("View");
        navigationManager.setCurrentComponent(new MenuView());
        Tab tab; 
        tab = tabBarView.addTab(navigationManager);
        TouchKitIcon.book.addTo(tab);
        tab = tabBarView.addTab(new Label("Tab 2"), "Edit");
        TouchKitIcon.edit.addTo(tab);
        tab = tabBarView.addTab(new AddListView(), "Add");
        TouchKitIcon.download.addTo(tab);
        setContent(tabBarView);
    }
}
