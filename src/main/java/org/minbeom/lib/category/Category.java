package org.minbeom.lib.category;

import java.util.HashMap;
import java.util.Map;

public enum Category {
    INSTANCE;

    private Map<String, CategoryComponent> cateQueue = new HashMap<>();
    private Map<String, CategoryAction> cateRegActQueue = new HashMap<>();

    Category() {
        registerCateInfo();
    }

    public Map<String, CategoryComponent> getCateQueue() {
        return cateQueue;
    }

    public CategoryAction GetCateCallback(String category) {
        return cateRegActQueue.get(category);
    }

    private void registerCateInfo() {
        cateRegActQueue.put(E_CATE.DOWNLOADER.name(), new CategoryAction(() -> Category.INSTANCE.RegisterDownloader()));
        cateRegActQueue.put(E_CATE.UPLOADER.name(), new CategoryAction(() -> Category.INSTANCE.RegisterUploader()));
    }

    private void RegisterDownloader() {
        CategoryGroup downloader = new CategoryGroup();
        CategoryGroup document = new CategoryGroup();
        CategoryGroup video = new CategoryGroup();
        CategoryAction mp4 = new CategoryAction(E_CATE.E_DOWNLOADER.E_VIDEO.MP4.getAction());

        video.Push(E_CATE.E_DOWNLOADER.E_VIDEO.MP4.name(), mp4);
        document.Push(E_CATE.E_DOWNLOADER.VIDEO.name(), video);
        downloader.Push(E_CATE.DOWNLOADER.name(), document);

        cateQueue.put(E_CATE.DOWNLOADER.name(), downloader);
    }

    private void RegisterUploader() {
        CategoryGroup uploader = new CategoryGroup();
        CategoryGroup document = new CategoryGroup();
        CategoryGroup video = new CategoryGroup();
        CategoryAction mp4 = new CategoryAction(E_CATE.E_UPLOADER.E_VIDEO.MP4.getAction());

        video.Push(E_CATE.E_UPLOADER.E_VIDEO.MP4.name(), mp4);
        document.Push(E_CATE.E_UPLOADER.VIDEO.name(), video);
        uploader.Push(E_CATE.UPLOADER.name(), document);

        cateQueue.put(E_CATE.UPLOADER.name(), uploader);
    }




}
