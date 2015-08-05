package com.example.massmutual.we_save;

/**
 * Created by massmutual on 8/5/2015.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class NotificationsAdapter extends BaseExpandableListAdapter
{
    private Context ctx;
    private HashMap<String, List<String>> notiCategories;
    private List<String> notiTypesList;
    private ExpandableListView expList;

    public NotificationsAdapter(Context ctx, HashMap<String, List<String>> notiCategories, List<String> notiTypesList)
    {
        this.ctx = ctx;
        this.notiCategories = notiCategories;
        this.notiTypesList = notiTypesList;
    }


    public int getGroupCount()
    {
        return notiTypesList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition)
    {
        return notiCategories.get(notiTypesList.get(groupPosition)).size();
    }

    public Object getGroup(int groupPosition)
    {
        return notiTypesList.get(groupPosition);
    }


    public Object getChild(int groupPosition, int childPosition)
    {
        return notiCategories.get(notiTypesList.get(groupPosition)).get(childPosition);
    }


    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition)
    {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }


    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent)
    {
        String groupTitle = (String) getGroup(groupPosition);
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_layout, parent, false);
        }

        TextView parentTextView = (TextView) convertView.findViewById(R.id.parent_txt);
        parentTextView.setTypeface(null, Typeface.BOLD);
        parentTextView.setText(groupTitle);
        return convertView;
    }


    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent)
    {
        String childTitle = (String) getChild(groupPosition, childPosition);
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_layout, parent, false);
        }

        TextView childTextView = (TextView) convertView.findViewById(R.id.child_txt);
        childTextView.setText(childTitle);
        return convertView;
    }


    public boolean isChildSelectable(int groupPosition, int childPosition)
    {
        return true;
    }
}