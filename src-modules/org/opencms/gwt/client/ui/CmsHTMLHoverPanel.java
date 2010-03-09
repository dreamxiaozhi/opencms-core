/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/client/ui/Attic/CmsHTMLHoverPanel.java,v $
 * Date   : $Date: 2010/03/08 11:36:11 $
 * Version: $Revision: 1.1 $
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

package org.opencms.gwt.client.ui;

import org.opencms.gwt.client.ui.css.I_CmsLayoutBundle;

import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * A HTML Panel implementation toggles the I_CmsStateCss.cmsHovering CSS class on mouse over.<p>
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
public class CmsHTMLHoverPanel extends HTMLPanel implements HasMouseOutHandlers, HasMouseOverHandlers {

    /**
     * Event handler to toggle the I_CmsStateCss.cmsHovering class on mouse out/over.<p>
     */
    class CmsHoverHandler implements MouseOutHandler, MouseOverHandler {

        /** The owner widget. */
        private Widget m_owner;

        /**
         * Constructor.<p>
         * 
         * @param owner the owner widget
         */
        CmsHoverHandler(Widget owner) {

            m_owner = owner;
        }

        /**
         * @see com.google.gwt.event.dom.client.MouseOutHandler#onMouseOut(com.google.gwt.event.dom.client.MouseOutEvent)
         */
        public void onMouseOut(MouseOutEvent event) {

            m_owner.removeStyleName(I_CmsLayoutBundle.INSTANCE.stateCss().cmsHovering());

        }

        /**
         * @see com.google.gwt.event.dom.client.MouseOverHandler#onMouseOver(com.google.gwt.event.dom.client.MouseOverEvent)
         */
        public void onMouseOver(MouseOverEvent event) {

            m_owner.addStyleName(I_CmsLayoutBundle.INSTANCE.stateCss().cmsHovering());

        }
    }

    /**
     * Creates an HTML hover panel with the specified HTML contents inside a DIV element. Any element within this HTML that has a specified id can contain a child widget.
     * 
     * @param html the panel's HTML
     */
    public CmsHTMLHoverPanel(String html) {

        super(html);
        CmsHoverHandler handler = new CmsHoverHandler(this);
        addMouseOutHandler(handler);
        addMouseOverHandler(handler);

    }

    /**
     * Creates an HTML hover panel whose root element has the given tag, and with the specified HTML contents. Any element within this HTML that has a specified id can contain a child widget.
     * 
     * @param tag the tag of the root element
     * @param html the panel's HTML
     */
    public CmsHTMLHoverPanel(String tag, String html) {

        super(tag, html);
        CmsHoverHandler handler = new CmsHoverHandler(this);
        addMouseOutHandler(handler);
        addMouseOverHandler(handler);
    }

    /**
     * @see com.google.gwt.event.dom.client.HasMouseOutHandlers#addMouseOutHandler(com.google.gwt.event.dom.client.MouseOutHandler)
     */
    public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {

        return this.addDomHandler(handler, MouseOutEvent.getType());

    }

    /**
     * @see com.google.gwt.event.dom.client.HasMouseOverHandlers#addMouseOverHandler(com.google.gwt.event.dom.client.MouseOverHandler)
     */
    public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {

        return this.addDomHandler(handler, MouseOverEvent.getType());
    }
}