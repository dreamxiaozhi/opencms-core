/*
 * File   : $Source: /alkacon/cvs/opencms/src/org/opencms/db/CmsCompositeQueryFragment.java,v $
 * Date   : $Date: 2011/03/15 17:33:19 $
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

package org.opencms.db;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * A query fragment which aggregates the results from a list of other query fragments.<p>
 * 
 * @author Georg Westenberger
 * @version $Revision: 1.1 $
 * @since 8.0.0
 */
public class CmsCompositeQueryFragment implements I_CmsQueryFragment {

    /** The list of query fragments which should be aggregated. */
    private List<I_CmsQueryFragment> m_fragments = Lists.newArrayList();

    /** The separator string which should be inserted between the SQL of each constituent query fragment. */
    private String m_separator;

    /**
     * Adds a new query fragment.<p>
     * 
     * @param node the query fragment 
     */
    public void add(I_CmsQueryFragment node) {

        m_fragments.add(node);
    }

    /**
     * Returns the wrapped query fragments.<p>
     * 
     * @return a list of query fragments 
     */
    public List<I_CmsQueryFragment> getNodes() {

        return m_fragments;
    }

    /**
     * Sets the separator which should be inserted between the constituent query fragments.<p>
     * 
     * @param separator the separator string  
     */
    public void setSeparator(String separator) {

        m_separator = separator;
    }

    /**
     * @see org.opencms.db.I_CmsQueryFragment#visit(org.opencms.db.CmsStatementBuilder)
     */
    public void visit(CmsStatementBuilder builder) {

        boolean first = true;
        if (m_prefix != null) {
            builder.add(m_prefix);
        }
        for (I_CmsQueryFragment node : m_fragments) {
            if (!first && (m_separator != null)) {
                builder.add(m_separator, Collections.<Object> emptyList());
            }
            node.visit(builder);
            first = false;

        }
        if (m_prefix != null) {
            builder.add(m_suffix);
        }
    }

    /**
     * Sets the prefix string (will be inserted before the other fragments).<p>
     * 
     * @param prefix the prefix string 
     */
    public void setPrefix(String prefix) {

        m_prefix = prefix;
    }

    /**
     * Sets the suffix string (will be inserted after the other fragments).<p>
     * 
     * @param suffix the suffix string 
     */
    public void setSuffix(String suffix) {

        m_suffix = suffix;
    }

    /** The prefix string. */
    private String m_prefix;

    /** The suffix string. */
    private String m_suffix;
}