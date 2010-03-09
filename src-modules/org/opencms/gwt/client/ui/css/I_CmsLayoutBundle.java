/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/client/ui/css/Attic/I_CmsLayoutBundle.java,v $
 * Date   : $Date: 2010/03/09 10:25:41 $
 * Version: $Revision: 1.4 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.gwt.client.ui.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.CssResource.Shared;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

/**
 * Resource bundle to access CSS and image resources.
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.4 $
 * 
 * @since 8.0.0
 */
public interface I_CmsLayoutBundle extends ClientBundle {

    /** Button CSS. */
    interface I_CmsButtonCss extends CssResource, I_CmsStateCss {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsButtonBig();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsButtonMedium();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsButtonSmall();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsImageButton();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsImageButtonTransparent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsMinWidth();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsTextButton();
    }

    /** Constants CSS. */
    interface I_CmsConstantsCss extends CssResource {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String backgroundColorBar();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String backgroundColorLight();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String borderColor();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String borderColorActive();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String borderColorInactive();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String color();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String colorDisabled();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String fontFamily();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String fontSize();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String fontSizeBig();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String fontSizeSmall();
    }

    /** Dialog CSS. */
    @Shared
    interface I_CmsDialogCss extends CssResource {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String menuPopup();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popup();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popupButtonPanel();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popupContent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popupHead();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popupMainContent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popupOverlay();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String popupShadow();
    }

    /** Icons CSS, making available a fixed set of icons. */
    interface I_CmsIconsCss extends CssResource, I_CmsStateCss {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("ui_icon")
        String uiIcon();

    }

    /** List item CSS. */
    interface I_CmsListItemCss extends I_CmsStateCss {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String buttonPanel();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String itemAdditional();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String itemAdditionalTitle();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String itemAdditionalValue();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String itemContainer();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String itemContent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String itemTitle();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String listItem();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String open();
    }

    /** General CSS. */
    @Shared
    interface I_CmsStateCss extends CssResource {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsHovering();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cmsState();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("cmsState-down")
        String cmsStateDown();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("cmsState-down-disabled")
        String cmsStateDownDisabled();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("cmsState-down-hovering")
        String cmsStateDownHovering();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("cmsState-up")
        String cmsStateup();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("cmsState-up-disabled")
        String cmsStateUpDisabled();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("cmsState-up-hovering")
        String cmsStateUpHovering();

    }

    /** Tabbed panel css. */
    interface I_CmsTabbedPanelCss extends CssResource {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("gwt-TabLayoutPanel")
        public String cmsTabLayoutPanel();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("gwt-TabLayoutPanelContent")
        public String cmsTabLayoutPanelContent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("gwt-TabLayoutPanelTab")
        public String cmsTabLayoutPanelTab();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("gwt-TabLayoutPanelTabBar")
        public String cmsTabLayoutPanelTabBar();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("gwt-TabLayoutPanelTabs")
        public String cmsTabLayoutPanelTabs();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        @ClassName("gwt-TabLayoutPanelTab-selected")
        public String cmsTabLayoutPanelTabSelected();
    }

    /** Toolbar CSS. */
    interface I_CmsToolbarCss extends CssResource {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbar();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbarBackground();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbarButtonsLeft();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbarButtonsRight();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbarContent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbarShadow();
    }

    /** The bundle instance. */
    I_CmsLayoutBundle INSTANCE = GWT.create(I_CmsLayoutBundle.class);

    /**
     * Access method.<p>
     *  
     * @return tabbed panel CSS
     */
    @Source("tabbedPanel.css")
    public I_CmsTabbedPanelCss tabbedPanelCss();

    /**
     * Access method.<p>
     * 
     * @return the image resource
     */
    @Source("images/ui-bg_glass_65_ffffff_1x400.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource backgroundActive();

    /**
     * Access method.<p>
     * 
     * @return the image resource
     */
    @Source("images/ui-bg_glass_75_cccccc_1x400.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource backgroundDefault();

    /**
     * Access method.<p>
     * 
     * @return the image resource
     */
    @Source("images/ui-bg_glass_75_e6e6e6_1x400.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource backgroundHover();

    /**
     * Access method.<p>
     * 
     * @return the image resource
     */
    @Source("images/ui-bg_highlight-soft_75_aaaaaa_1x100.png")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource backgroundSoft();

    /**
     * Access method.<p>
     * 
     * @return the button CSS
     */
    @Source("button.css")
    I_CmsButtonCss buttonCss();

    /**
     * Access method.<p>
     * 
     * @return the constants CSS
     */
    @Source("constants.css")
    I_CmsConstantsCss constantsCss();

    /**
     * Access method.<p>
     * 
     * @return the dialog CSS
     */
    @Source("dialog.css")
    I_CmsDialogCss dialogCss();

    /**
     * Access method.<p>
     * 
     * @return the image resource
     */
    @Source("images/ui-icons_222222_256x240.png")
    ImageResource iconActive();

    /**
     * Access method.<p>
     * 
     * @return the image resource
     */
    @Source("images/ui-icons_444444_256x240.png")
    ImageResource iconDefault();

    /**
     * Access method.<p>
     * 
     * @return the icons CSS
     */
    @Source("buttonIcons.css")
    @CssResource.NotStrict
    I_CmsIconsCss iconsCss();

    /**
     * Access method.<p>
     * 
     * @return the list item CSS
     */
    @Source("listItem.css")
    I_CmsListItemCss listItemCss();

    /**
     * Access method. These CSS classes are used to indicate the state of ui items, use them within a dedicated CSS resources.
     * Do not inject this CSS, as it contains no style information.<p>
     * 
     * @return the state CSS
     */
    @Source("state.css")
    I_CmsStateCss stateCss();

    /**
     * Access method.<p>
     * 
     * @return the toolbar CSS
     */
    @Source("toolbar.css")
    I_CmsToolbarCss toolbarCss();

}
