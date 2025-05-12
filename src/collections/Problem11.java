

//Problem 11: Company Asset Tracker (Map<String, Set<Asset>>)
//Store assets per department with unique Asset objects.
//        • Detect duplicate asset IDs globally.

package collections;
import  java.util.*;

class Asset {
    private String assetId;
    private String name;

    public Asset(String assetId, String name) {
        this.assetId = assetId;
        this.name = name;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asset)) return false;
        Asset asset = (Asset) o;
        return Objects.equals(assetId, asset.assetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId);
    }

    @Override
    public String toString() {
        return assetId + " - " + name;
    }


}
public class Problem11 {

    private static Map<String, Set<Asset>> departmentAssets = new HashMap<>();
    private static Set<String> allAssetIds = new HashSet<>();

    public static void addAsset(String department, Asset asset) {
        if (allAssetIds.contains(asset.getAssetId())) {
            System.out.println("Duplicate asset ID detected: " + asset.getAssetId());
            return;
        }

        departmentAssets
                .computeIfAbsent(department, k -> new HashSet<>())
                .add(asset);

        allAssetIds.add(asset.getAssetId());
    }

    public static void printAssets() {
        for (Map.Entry<String, Set<Asset>> entry : departmentAssets.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Asset asset : entry.getValue()) {
                System.out.println("  - " + asset);
            }
        }
    }

    public static void main(String[] args) {

        addAsset("IT", new Asset("A001", "Laptop"));
        addAsset("HR", new Asset("A002", "Projector"));
        addAsset("IT", new Asset("A003", "Server"));
        addAsset("Finance", new Asset("A002", "Tablet")); // duplicate ID

        printAssets();

    }
}
