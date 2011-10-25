package org.diretto.api.client.main.core.binding.resources;

import java.util.ArrayList;

import org.diretto.api.client.main.core.binding.resources.BoundingBoxResource;
import org.diretto.api.client.main.core.binding.resources.TimeRangeResource;

/**
 * This class represents a POJO based {@code DocumentQueryResource}. <br/><br/>
 * 
 * It is used for operating with the data interchange format JSON. So it is
 * possible to marshal Java objects into JSON representation and to unmarshal
 * JSON messages into Java objects. <br/><br/>
 * 
 * <i>Annotation:</i> This is also called <u>(full) data binding<u/>
 * 
 * @author Tobias Schlecht
 */
public final class DocumentQueryResource
{
	private TimeRangeResource time;
	private BoundingBoxResource location;
	private ArrayList<String> tags;
	private TimeRangeResource publishedBetween;

	public TimeRangeResource getTime()
	{
		return time;
	}

	public void setTime(TimeRangeResource time)
	{
		this.time = time;
	}

	public BoundingBoxResource getLocation()
	{
		return location;
	}

	public void setLocation(BoundingBoxResource location)
	{
		this.location = location;
	}

	public ArrayList<String> getTags()
	{
		return tags;
	}

	public TimeRangeResource getPublishedBetween()
	{
		return publishedBetween;
	}

	public void setPublishedBetween(TimeRangeResource publishedBetween)
	{
		this.publishedBetween = publishedBetween;
	}

	public void setTags(ArrayList<String> tags)
	{
		this.tags = tags;
	}
}
