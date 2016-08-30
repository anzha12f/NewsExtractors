package com.news.model;

import java.io.Serializable;

public class NewsExtract implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String url;
	private String image;
	private String imageAlt;
	private String mediaLink;
	private String mediaLinkAlt;
	private String mediaTagLink;
	private String mediaTagLinkAlt;
	private String blockOverlayLink;
	private String blockOverlayLinkAlt;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImageAlt() {
		return imageAlt;
	}
	public void setImageAlt(String imageAlt) {
		this.imageAlt = imageAlt;
	}
	public String getMediaLink() {
		return mediaLink;
	}
	public void setMediaLink(String mediaLink) {
		this.mediaLink = mediaLink;
	}
	public String getMediaLinkAlt() {
		return mediaLinkAlt;
	}
	public void setMediaLinkAlt(String mediaLinkAlt) {
		this.mediaLinkAlt = mediaLinkAlt;
	}
	public String getMediaTagLink() {
		return mediaTagLink;
	}
	public void setMediaTagLink(String mediaTagLink) {
		this.mediaTagLink = mediaTagLink;
	}
	public String getMediaTagLinkAlt() {
		return mediaTagLinkAlt;
	}
	public void setMediatagLinkAlt(String mediaTagLinkAlt) {
		this.mediaTagLinkAlt = mediaTagLinkAlt;
	}
	public String getBlockOverlayLink() {
		return blockOverlayLink;
	}
	public void setBlockOverlayLink(String blockOverlayLink) {
		this.blockOverlayLink = blockOverlayLink;
	}
	public String getBlockOverlayLinkAlt() {
		return blockOverlayLinkAlt;
	}
	public void setBlockOverlayLinkAlt(String blockOverlayLinkAlt) {
		this.blockOverlayLinkAlt = blockOverlayLinkAlt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	 @Override
	   public String toString() {
	     return "NewsExtracte [url=" + url + ", image=" + image + ", imageAlt=" + 
	    		    imageAlt + ", mediaLink=" + mediaLink + ", medialLinkAlt=" +
	    		    mediaLinkAlt + ", mediaTag=" + mediaTagLink +", mediaTagAlt=" + 
	    		    mediaTagLinkAlt +
	    		    ", blockOverlay=" + blockOverlayLink + ", blockOverlayAlt=" + blockOverlayLinkAlt +
	    		    "]";
       }
}

